package dev.ranieri.services;

import dev.ranieri.entities.Score;

import java.util.List;

public interface ScoreService {

    List<Score> getAllScores();

    boolean deleteScoreById(int id);
}
