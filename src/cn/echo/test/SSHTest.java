package cn.echo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.echo.model.Category;
import cn.echo.service.CategoryService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext*.xml")
public class SSHTest {

	
	@Autowired
	private CategoryService categoryService;
	
	@Test
	public void testHibernate() {
		Category category = new Category();
		category.setId(1);
		category.setName("裤子");
		categoryService.save(category);
	}
}
