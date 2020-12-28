package cilicili.jz2.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Data
@Component
public class Collection implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer collectionId;

    private Integer userId;

    private Integer videoId;


    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }


    @Override
    public String toString() {
        return "Collection{" +
                "collectionId=" + collectionId +
                ", userId=" + userId +
                ", videoId=" + videoId +
                "}";
    }
}
