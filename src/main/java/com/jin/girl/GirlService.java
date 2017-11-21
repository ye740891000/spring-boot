package com.jin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jzh
 * @date2017/11/21 0021下午 3:32
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(18);
        girlRepository.save(girlB);

    }
}
