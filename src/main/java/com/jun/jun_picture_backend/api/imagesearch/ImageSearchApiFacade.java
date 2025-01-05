package com.jun.jun_picture_backend.api.imagesearch;

import com.jun.jun_picture_backend.api.imagesearch.model.ImageSearchResult;
import com.jun.jun_picture_backend.api.imagesearch.sub.GetImageFirstUrlApi;
import com.jun.jun_picture_backend.api.imagesearch.sub.GetImageListApi;
import com.jun.jun_picture_backend.api.imagesearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ImageSearchApiFacade {  
  
    /**  
     * 搜索图片  
     *  
     * @param imageUrl  
     * @return  
     */  
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;  
    }  
  
    public static void main(String[] args) {  
        // 测试以图搜图功能  
        String imageUrl = "https://img13.360buyimg.com/n1/s450x450_jfs/t1/171695/26/44283/137470/6604035cF31b20621/5f2272c9b6654a35.jpg";
        List<ImageSearchResult> resultList = searchImage(imageUrl);  
        System.out.println("结果列表" + resultList);  
    }  
}
