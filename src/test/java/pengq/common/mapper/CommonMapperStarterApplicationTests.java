package pengq.common.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pengq.common.mapper.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonMapperStarterApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserDao userDao;

	@Test
	public void test(){
		System.currentTimeMillis();
	}
}
