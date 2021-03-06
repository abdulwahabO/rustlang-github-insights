package io.github.abdulwahabo.rai.dashboard.dao;

import io.github.abdulwahabo.rai.dashboard.model.AggregateEventData;

import java.util.List;
import java.util.Optional;

public interface AggregateEventDataDao {

    Optional<List<AggregateEventData>> get(String startDate, String endDate);
}
