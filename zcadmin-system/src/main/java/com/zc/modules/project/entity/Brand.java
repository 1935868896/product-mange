package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 品牌表 pms_brand
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="品牌",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Brand extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="品牌id",name="brandId")
    private Long brandId;

    @ApiModelProperty(value="品牌名",name="name")
    private String name;

    @ApiModelProperty(value="品牌logo地址",name="logo")
    private String logo;

    @ApiModelProperty(value="介绍",name="descript")
    private String descript;

    @ApiModelProperty(value="显示状态[0-不显示；1-显示]",name="showStatus")
    private Integer showStatus;

    @ApiModelProperty(value="检索首字母",name="firstLetter")
    private String firstLetter;

    @ApiModelProperty(value="排序",name="sort")
    private Integer sort;

}
