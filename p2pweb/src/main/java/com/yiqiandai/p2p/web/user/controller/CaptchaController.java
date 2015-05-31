package com.yiqiandai.p2p.web.user.controller;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.yiqiandai.p2p.base.controller.BaseController;

@Controller
@RequestMapping("/user")
public class CaptchaController extends BaseController{
	/**
	 * Kaptcha 验证码
	 */
	@Autowired
	private DefaultKaptcha captchaProducer;

	/**
	 * 生成验证码
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "captcha.dhtml", method = RequestMethod.GET)
	public void captcha(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control",
				"no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		String capText = captchaProducer.createText();
		request.getSession().setAttribute(
				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, capText);
		BufferedImage bi = captchaProducer.createImage(capText);
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(bi, "jpg", out);
		try {
			out.flush();
		} finally {
			out.close();
		}
	}
}
