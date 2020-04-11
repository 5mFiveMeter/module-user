package cn.fivemeter.module.user.service.impl;

import cn.fivemeter.module.user.bean.User;
import cn.fivemeter.module.user.dao.UserMapper;
import cn.fivemeter.module.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wm
 * @since 2020-04-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
