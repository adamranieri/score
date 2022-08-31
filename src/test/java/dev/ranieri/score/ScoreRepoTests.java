package dev.ranieri.score;

import dev.ranieri.entities.Score;
import dev.ranieri.repos.ScoreRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional // any CRUD operations will not persist outside the test all statements are rolled back
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;

    @Test
    void add_score(){
        Score score = new Score(0,1000,"BBB");
        Score savedScore = this.scoreRepo.save(score);
        Assertions.assertNotEquals(0,savedScore.getId());
    }

    @Test
    void all_scores(){

        Score score1 = new Score(0,1000,"AAA");
        Score savedScore1 = this.scoreRepo.save(score1);

        Score score2 = new Score(0,1000,"AAA");
        Score savedScore2 = this.scoreRepo.save(score2);

        Score score3 = new Score(0,1000,"AAA");
        Score savedScore3 = this.scoreRepo.save(score3);


        List<Score> scores = this.scoreRepo.findAll();
        System.out.println(scores);
        Assertions.assertEquals(3,scores.size());

    }
}
