package day01.numBaseballExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 1부터 9까지의 서로 다른 임의의 수 3개 생성
 */

public class GenerateRandomNum {
    public int randomMake() {
        Random random = new Random();
        return random.nextInt(9) + 1;

        /*
            1~9 사이의 random 값을 가져오기 위해
            random.nextInt(max) + min
            max - random값 중 가장 큰 값
            min - random값 중 가장 작은 값

            0-9까지의 random 값을 가져오기 위해선
            Random random = new Random();
            random.nextInt(9);
        */
    }

    public List<Integer> create() {
        List<Integer> computerNum = new ArrayList<>();
        while (computerNum.size() < 3) {
            int randomNum = randomMake();
            if (computerNum.contains(randomNum)) {
                continue;
            } else {
                computerNum.add(randomNum);
            }
        }
        return computerNum;
    }
}
