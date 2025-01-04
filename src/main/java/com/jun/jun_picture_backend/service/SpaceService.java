package com.jun.jun_picture_backend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jun.jun_picture_backend.model.dto.space.SpaceAddRequest;
import com.jun.jun_picture_backend.model.dto.space.SpaceQueryRequest;
import com.jun.jun_picture_backend.model.entity.Space;
import com.jun.jun_picture_backend.model.entity.User;
import com.jun.jun_picture_backend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author gao
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-01-01 23:26:15
*/
public interface SpaceService extends IService<Space> {

    /**
     * 校验空间
     */
    void validSpace(Space space, boolean add);

    /**
     * 获取空间封装
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 分页获取空间封装
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别填充空间对象
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 创建空间
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
}
