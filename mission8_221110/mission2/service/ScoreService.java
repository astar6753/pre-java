package mission8_221110.mission2.service;

import mission8_221110.mission2.model.Score;
import mission8_221110.mission2.model.TextResource;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {
    private static ScoreService scoreService = new ScoreService();

    private ScoreService() {
    }

    public static ScoreService getInstance() {
        return scoreService;
    }

}
