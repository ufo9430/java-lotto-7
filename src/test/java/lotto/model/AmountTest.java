package lotto.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {
    @Test
    void 발행_금액_생성(){
        Amount amount = new Amount("15000");
        Assertions.assertThat(amount.getAmount()).isEqualTo(15000);
    }

    @Test
    void 발행하는_로또의_갯수_테스트(){
        Amount amount = new Amount("15500");
        Assertions.assertThat(amount.toCount()).isEqualTo(15);
    }

    @Test
    void 입력한_금액_값이_0보다_작은지_확인한다(){
        String input = "-1000";
        assertThrows(IllegalArgumentException.class, () -> new Amount(input));
    }

    @Test
    void 입력한_금액_값이_숫자가_아닌_값이_있는지_확인한다(){
        String input = "1d000";
        assertThrows(IllegalArgumentException.class, () -> new Amount(input));
    }

    @Test
    void 입력값이_비어있는지_확인한다(){
        String input = "";
        assertThrows(IllegalArgumentException.class, () -> new Amount(input));
    }

}