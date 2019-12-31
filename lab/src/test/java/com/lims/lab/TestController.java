package com.lims.lab;

import com.lims.lab.mapper.TbRoleMapper;
import com.lims.lab.pojo.TbRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    private TbRoleMapper roleMapper;

    @Test
    public void selectAll(){
        List<TbRole> roleList = roleMapper.selectList(null);
        for (TbRole tbRole : roleList) {
            System.out.println("tbRole = " + tbRole);
        }
    }

}
