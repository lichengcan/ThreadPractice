package com.lcc.treadpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TreadPracticeApplicationTests {

    @Test
    void contextLoads() {

        ClimbTread climbTread = new ClimbTread("小灿",500,1);
        ClimbTread climbTread1 = new ClimbTread("jules",1000,2);
        climbTread.start();
        climbTread1.start();
    }

}
