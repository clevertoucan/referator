package youtubeAPIUtil;

import com.google.api.services.youtube.model.SearchResult;
import java.util.List;

/**
 * Created by Joshua Owens on 11/15/15.
 */
public class YTLookup {
    public static void main(String[] args){
        List<SearchResult> result = Search.search();
        for(SearchResult item : result){
            System.out.println(item.getSnippet().getTitle());
            System.out.println(item.getSnippet().getThumbnails().getDefault());
            System.out.println(item.getSnippet().getChannelTitle());
            System.out.println(item.getId().getVideoId());
            System.out.println();
        }
    }
}
