package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoCount;

import static lotto.message.ErrorMessage.ERROR_MESSAGE_HEAD;
import static lotto.message.InfoMessage.*;
import static lotto.message.ErrorMessage.INVALID_MONEY_INPUT_EXCEPTION;

public class Printer {
    public static void printLineBreak() {
        System.out.println();
    }

    public static void printPurchaseAmountChoiceMessage() {
        System.out.println(PURCHASE_AMOUNT_CHOICE);
    }

    public static void printMoneyInputExceptionMessage() {
        System.out.println(ERROR_MESSAGE_HEAD + INVALID_MONEY_INPUT_EXCEPTION);
    }

    public static void printLottoCount(LottoCount lottoCount) {
        System.out.println(lottoCount.getLottoCount() + PURCHASE_COMPLETE);
    }

    public static void printLotto(Lotto lotto) {
        System.out.println(lotto.getNumbers());
    }
}
