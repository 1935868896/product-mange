package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 商品评价表 pms_spu_comment
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="商品评价",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpuComment extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="sku_id",name="skuId")
    private Long skuId;

    @ApiModelProperty(value="spu_id",name="spuId")
    private Long spuId;

    @ApiModelProperty(value="商品名字",name="spuName")
    private String spuName;

    @ApiModelProperty(value="会员昵称",name="memberNickName")
    private String memberNickName;

    @ApiModelProperty(value="星级",name="star")
    private Integer star;

    @ApiModelProperty(value="会员ip",name="memberIp")
    private String memberIp;

    @ApiModelProperty(value="显示状态[0-不显示，1-显示]",name="showStatus")
    private Integer showStatus;

    @ApiModelProperty(value="购买时属性组合",name="spuAttributes")
    private String spuAttributes;

    @ApiModelProperty(value="点赞数",name="likesCount")
    private Integer likesCount;

    @ApiModelProperty(value="回复数",name="replyCount")
    private Integer replyCount;

    @ApiModelProperty(value="评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]",name="resources")
    private String resources;

    @ApiModelProperty(value="内容",name="content")
    private String content;

    @ApiModelProperty(value="用户头像",name="memberIcon")
    private String memberIcon;

    @ApiModelProperty(value="评论类型[0 - 对商品的直接评论，1 - 对评论的回复]",name="commentType")
    private Integer commentType;

}
