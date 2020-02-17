package io.zmyzheng.restapi.repositories;

import io.zmyzheng.restapi.domains.Tweet;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Mingyang Zheng
 * @Date: 2020-02-17 00:51
 */

@Repository
public interface TweetRepository extends ElasticsearchRepository<Tweet, String> {

}
