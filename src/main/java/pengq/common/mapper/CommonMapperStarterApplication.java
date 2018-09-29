package pengq.common.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pengq.common.mapper.dao.UserDao;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * FileName:     BaseRepository
 *
 * @author : pengq
 * @version V1.0
 * CreateDate:         2018/9/29 14:52
 */
@MapperScan(basePackages = "pengq.common.mapper.dao")
@SpringBootApplication
@RestController
public class CommonMapperStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonMapperStarterApplication.class, args);
	}

	@Autowired
	UserDao userDao;

	@GetMapping(value = "/users")
	public Object getUsers(){
		return userDao.selectAll();
	}
}
