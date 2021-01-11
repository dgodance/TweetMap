package io.zmyzheng.processor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Mingyang Zheng
 * @Date: 2020-02-11 21:31
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tweet implements UniqueEntity<String> {

    private String id;

    private long timestamp;

    private List<String> hashTags;

    private List<Double> coordinate;

    @Override
    public String getUniqueKey() {
        return getId();
    }
}
