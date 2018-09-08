package UserServices;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zb.dao.UserMapper;
import com.zb.entity.User;
import com.zb.entity.UserExample;
import com.zb.service.UserServices;

@Service("userServices")
@Transactional
public class UserServicesImpl implements UserServices{
	
	private UserMapper userMapper;
	
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

}
