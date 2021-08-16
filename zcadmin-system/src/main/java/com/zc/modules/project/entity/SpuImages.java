package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * spu图片表 pms_spu_images
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="spu图片",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpuImages extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="spu_id",name="spuId")
    private Long spuId;

    @ApiModelProperty(value="图片名",name="imgName")
    private String imgName;

    @ApiModelProperty(value="图片地址",name="imgUrl")
    private String imgUrl;

    @ApiModelProperty(value="顺序",name="imgSort")
    private Integer imgSort;

    @ApiModelProperty(value="是否默认图",name="defaultImg")
    private Integer defaultImg;

}
