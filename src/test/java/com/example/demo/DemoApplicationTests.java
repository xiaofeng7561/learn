package com.example.demo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.example.demo.component.TestComponent;
import com.example.demo.dao.SysUserDao;
import com.example.demo.entity.SysUserPo;
import com.example.demo.service.ISysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@ConfigurationPropertiesScan
class DemoApplicationTests {

	@Autowired
	private TestComponent testComponent;


	@Autowired
	private ISysUserService userService;



	@Test
	void contextLoads(){

		/*HashMap<String,Object> map = new HashMap<>();
		map.put("phone","1");
		userService.query().allEq((x,y)->{
			System.out.println(x);
			System.out.println(y);
			return false;},map).list();*/


		HashMap<SFunction<SysUserPo, ?>, Object> hashMap = new HashMap<>();
		hashMap.put(SysUserPo::getPhone,"1");

		userService.lambdaQuery().allEq((x,y)->{
			Object apply = x.apply(new SysUserPo().setPhone("2"));
			System.out.println(apply);
			System.out.println(y);
			return false;},hashMap).list();


		userService.getMap(Wrappers.<SysUserPo>lambdaQuery().select());


	}

}
