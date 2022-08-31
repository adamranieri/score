package dev.ranieri.services;

import dev.ranieri.entities.Score;
import dev.ranieri.repos.ScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreRepo scoreRepo;

    @Override
    public List<Score> getAllScores() {
        return this.scoreRepo.findAll();
    }

    @Override
    public boolean deleteScoreById(int id) {

        if(this.scoreRepo.existsById(id)){
            this.scoreRepo.deleteById(id);
            return true;
        }else{
            return false;
        }

    }
}
