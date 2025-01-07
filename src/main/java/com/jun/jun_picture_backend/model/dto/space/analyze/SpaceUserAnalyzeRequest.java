package com.jun.jun_picture_backend.model.dto.space.analyze;

import com.jun.jun_picture_backend.model.dto.space.analyze.SpaceAnalyzeRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SpaceUserAnalyzeRequest extends SpaceAnalyzeRequest {
  
    /**  
     * 用户 ID  
     */  
    private Long userId;  
  
    /**  
     * 时间维度：day / week / month  
     */  
    private String timeDimension;  
}
