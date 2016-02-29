package pl.pwr.news.service.article;

import org.springframework.stereotype.Service;
import pl.pwr.news.model.article.Article;
import pl.pwr.news.service.CrudOperations;

/**
 * Created by jakub on 2/29/16.
 */
@Service
public interface ArticleService extends CrudOperations<Article> {
}
