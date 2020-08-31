package com.covid.epass.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.covid.epass.model.GeneratePdf;
import com.covid.epass.model.UserPojo;
import com.covid.epass.repository.Userrepo;
import com.itextpdf.text.DocumentException;
@Controller
public class MailController {
	
	@Autowired
	Userrepo repo;
	
	@Autowired
	public  JavaMailSenderImpl JavaMailSender;
	
	public static int otp=1469;
	
	//Allows admin to reject the e-pass
	@RequestMapping(value="/reject/{aid}",method=RequestMethod.GET)
	public String rejectEpass(@PathVariable("aid") int aid) {
		String temp="Denied";
		SimpleMailMessage msg=new SimpleMailMessage();
		UserPojo userPojo=repo.findById(aid).orElse(new UserPojo());
		msg.setTo(userPojo.getEmail());
		msg.setSubject("Rejection of e-pass");
		msg.setText("Your e-pss has been rejected");
		userPojo.setStatus(temp);
		repo.saveAndFlush(userPojo);
		JavaMailSender.send(msg);
		return "/status?status=OnProcess";
	}
	
	//Allows admin to provide e-pass
	@RequestMapping(value="/generate-pdf-and-provide-e-pass/{aid}")
	public String provideEpass(@PathVariable("aid") int aid) throws IOException, DocumentException, MessagingException {
		String temp="Granted";
		UserPojo userPojo=repo.findById(aid).orElse(new UserPojo());
		userPojo.setStatus(temp);
		repo.saveAndFlush(userPojo);
		ByteArrayOutputStream bos = GeneratePdf.pass(userPojo);
		DataSource aAttachment =  new ByteArrayDataSource(bos.toByteArray(), "application/pdf");
		MimeMessage ms=JavaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(ms,true);
		helper.setTo(userPojo.getEmail());
		helper.setSubject("covid 19 e-pass");
		helper.setText("Your e-pass has been granted.........");
		helper.addAttachment("e-pass",aAttachment);
		JavaMailSender.send(ms);
        return "/status?status=OnProcess";
	}
	
	//Generates otp for the applied user
	@RequestMapping("/verify")
	public  String verifyUserEmail(@RequestParam("mail") String mail) {
		Random rand = new Random();
		otp=rand.nextInt(1000000);
		String temp=Integer.toString(otp);
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(mail);
		msg.setSubject("e-pass verification");
		msg.setText("Your otp is :  "+temp);
		JavaMailSender.send(msg);
		return "otpVerify.jsp";
	}
	
	//Verifies the otp of user
	@RequestMapping("/verifyOtp")
	public static String sendOtpToUser(@RequestParam("otpp") String otpv) {
		String res;
		if(otp==Integer.parseInt(otpv)) {
			res= "userform.jsp";
		}
		else {
			res= "otpVerify.jsp";
		}
		return res;
	}
}
