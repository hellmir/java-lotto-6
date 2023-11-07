package lotto.domain;

import lotto.validation.LottoNumberValidator;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        LottoNumberValidator.validateDuplicateNumbers(numbers);
        LottoNumberValidator.validateNumberRange(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
