package com.o2o.business.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.gson.Gson;
import com.o2o.business.service.UserService;
import com.o2o.core.base.BaseController;
import com.o2o.framework.core.log.Logger;
import com.o2o.framework.core.log.LoggerFactory;
import com.o2o.model.param.UserBo;
import com.o2o.model.request.Login;
import com.o2o.model.request.Register;
import com.o2o.model.result.Goods;
import com.o2o.model.result.Result;
import com.o2o.model.result.User;

/**
 * IDEA 与用户相关的业务接口
 * 
 * @Description Created by bowen.ma on 14-10-2.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	/**
	 * 登录接口
	 * 
	 * @param bo
	 * @return
	 */
	@RequestMapping("/login.json")
	@ResponseBody
	public Result login(Login bo) {
		String msg = bo.valid(bo);
		Result result = new Result();
		if (msg != null) {
			setStatusError(result, msg);
			return result;
		}
		// 游客登录
		if (StringUtils.equals(bo.getType(), "1")) {

		}
		// o2o
		else if (StringUtils.equals(bo.getType(), "2")) {

		}
		// qq
		else if (StringUtils.equals(bo.getType(), "3")) {

		}
		// weixin
		else if (StringUtils.equals(bo.getType(), "4")) {

		}
		// weibo
		else if (StringUtils.equals(bo.getType(), "5")) {

		}
		User user = new User();
		user.setId("1234");
		user.setUsername("陈海峰是演员");
		user.setToken(System.currentTimeMillis() + "");
		user.setLevel(2);
		user.setScores(100);
		user.setLocation("39.112,119.40");
		user.setAddress("北京市立水桥");
		user.setPhone("123456789");
		setStatusOk(result, user);
		return result;
	}

	/**
	 * 注册接口
	 * 
	 * @param bo
	 * @return
	 */
	@RequestMapping("/register.json")
	@ResponseBody
	public Result register(Register bo) {
		String msg = bo.valid(bo);
		Result result = new Result();
		if (msg != null) {
			setStatusError(result, msg);
			return result;
		}
		logger.info("[o2o][controller] register user info :{}", new Object[]{new Gson().toJson(bo).toString()});

		UserBo userBo = new UserBo();
		userBo.setPhone(bo.getPhone());
		userBo.setUsername(bo.getUsername());
		boolean returnRes = userService.register(userBo);
		if(returnRes){
			setStatusOk(result, null);
		}
		
		return result;
	}

	/**
	 * 注销接口
	 * 
	 * @param token
	 * @return
	 */
	@RequestMapping("/logout.json")
	@ResponseBody
	public Result logout(String token) {

		Result result = new Result();
		if (StringUtils.isBlank(token)) {
			setStatusError(result, "token不能为空");
			return result;
		}
		setStatusOk(result, null);
		return result;
	}
	/**
	 * 商品信息上传接口
	 * @param files
	 * @param title
	 * @param desc
	 * @param location
	 * @param price
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/upload.json")
	@ResponseBody
	public Result upload(@RequestParam("file") CommonsMultipartFile[] files,
			@RequestParam("title") String title,
			@RequestParam("desc") String desc,
			@RequestParam("location") String location,
			@RequestParam("price") double price, HttpServletRequest request,
			ModelMap model) {

		String path = request.getSession().getServletContext()
				.getRealPath("upload");
		File targetFile = new File(path);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		Result result = new Result();
		if (files.length < 1) {
			setStatusError(result, "商品图片不能为空");
			return result;
		}
		Goods good = new Goods();
		good.setDesc(desc);
		good.setLocation(location);
		good.setPrice(price);
		good.setTitle(title);
		List<String> images = new ArrayList<String>();
		for (int i = 0; i < files.length; i++) {
			logger.info("fileName---------->" + files[i].getOriginalFilename());
			if (!files[i].isEmpty()) {
				int pre = (int) System.currentTimeMillis();
				try {
					
					// 拿到输出流，同时重命名上传的文件
					FileOutputStream os = new FileOutputStream(path + "/"
							+ new Date().getTime()
							+ files[i].getOriginalFilename());
					images.add(path + "/"
							+ new Date().getTime()
							+ files[i].getOriginalFilename());
					// 拿到上传文件的输入流
					FileInputStream in = (FileInputStream) files[i]
							.getInputStream();

					// 以写字节的方式写文件
					int b = 0;
					while ((b = in.read()) != -1) {
						os.write(b);
					}
					os.flush();
					os.close();
					in.close();
					int finaltime = (int) System.currentTimeMillis();

				} catch (Exception e) {
					logger.error("上传出错", e);
				}
			}

		}
		good.setImages(images);
		String msg = good.valid(good);
		if (msg != null) {
			setStatusError(result, msg);
			return result;
		}else{
			setStatusOk(result,null);

			return result;
		}
	}
}
