package com.goodjwon.infrun.intellj.chap7;

/**
 * 디버그 단축키
 * 현재 위치한 메소드 디버그: control + shift + d
 * 이전에 실행한 메소드 디버그: control + d
 * Resume 다음 브레이크 포인트로 이동 하기: command + option + r
 * Step Over (브레이크 포인트로에서 다음 줄 실행 하기): F8
 * Step Info (브레이크 포인트에서 다음 메소드 실행 하기): F7
 * Step Out(Step Info로 들어간 포커스를 밖으로 이동 시킴): Shift+F8
 * Evaluate Express(프레이크 포인트에 종속된 다른 코드를 직시 실행): option + F8
 * Watch 브레이크 이후에 속속에 관련된 값을 찾을 때 사용: 없음
 */

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @After
    public void tearDown() throws Exception {
        productRepository.deleteAllInBatch();
    }

    @Test
    public void 기본디버깅() {
        //given & when
        Long id = productService.register(1000L, "책");

        //then
        assertThat(id, is(1L));
    }

    @Test
    public void Evaluate사용하기() {
        //given
        productRepository.save(new Product(1000L, "책"));
        productRepository.save(new Product(2000L, "운동화"));
        productRepository.save(new Product(3000L, "냉장고"));

        //when
        Product product = productService.findByName("운동화");

        //then
        assertThat(product.getAmount(), is(2000L));
    }
}