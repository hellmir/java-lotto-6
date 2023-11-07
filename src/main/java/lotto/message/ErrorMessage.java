package lotto.message;

import static lotto.configuration.InputFormatConfig.LOTTO_PRICE;

public class ErrorMessage {
    public static final String ERROR_MESSAGE_HEAD = "[ERROR] ";
    public static final String INVALID_MONEY_FORMAT_EXCEPTION = "구입금액은 양의 정수 값만 입력할 수 있습니다. 예 : 1000";
    public static final String MONEY_NOT_MULTIPLE_EXCEPTION
            = "구입금액은 " + LOTTO_PRICE + "원 단위여야 합니다. 예 : " + LOTTO_PRICE * 3;
}
