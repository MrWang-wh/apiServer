package cilicili.jz2.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class History implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer historyId;

    private Integer userId;

    private Integer videoId;

    private LocalDate watchTime;


    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
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

    public LocalDate getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(LocalDate watchTime) {
        this.watchTime = watchTime;
    }


    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", userId=" + userId +
                ", videoId=" + videoId +
                ", watchTime=" + watchTime +
                "}";
    }
}
