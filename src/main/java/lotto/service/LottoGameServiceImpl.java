package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.LottoCount;
import lotto.domain.Lottos;
import lotto.utility.RandomNumberGenerator;
import lotto.utility.TypeConverter;

import java.util.List;

public class LottoGameServiceImpl implements LottoGameService {
    @Override
    public LottoCount computeLottoCount(String purchaseAmount) {
        int money = TypeConverter.convertStringToInt(purchaseAmount);
        return LottoCount.from(money);
    }

    @Override
    public Lottos generateLottos(LottoCount lottoCount) {
        Lottos lottos = new Lottos();

        for (int i = 0; i < lottoCount.getLottoCount(); i++) {
            Lotto lotto = generateLotto();
            lottos.add(lotto);
        }

        return lottos;
    }

    private Lotto generateLotto() {
        List<Integer> lottoNumbers = RandomNumberGenerator.generateNotDuplicatedRandomNumbers();
        return new Lotto(lottoNumbers);
    }
}
