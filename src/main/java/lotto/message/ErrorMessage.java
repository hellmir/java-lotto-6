package lotto.message;

import static lotto.configuration.InputFormatConfig.LOTTO_PRICE;

public class ErrorMessage {
    public static final String ERROR_MESSAGE_HEAD = "[ERROR] ";
    public static final String INVALID_MONEY_INPUT_EXCEPTION
            = "구입금액은 " + LOTTO_PRICE + "원 단위의 양의 정수 값만 입력할 수 있습니다. 예 : "
            + LOTTO_PRICE + ", " + LOTTO_PRICE * 20 + ", " + LOTTO_PRICE * 300;
    public static final String DUPLICATE_NUMBER_EXCEPTION = "중복된 숫자가 존재합니다. ";
    public static final String NUMBER_INDICATION = "번째 숫자 : ";
}
