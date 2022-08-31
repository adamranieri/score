package dev.ranieri.services;

import dev.ranieri.entities.Score;

import java.util.List;

public interface ScoreService {

    List<Score> getAllScores();


    Score createScore(Score score);

    boolean deleteScoreById(int id);

}
