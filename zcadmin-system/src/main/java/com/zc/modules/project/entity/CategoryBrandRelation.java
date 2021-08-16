package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 品牌分类关联表 pms_category_brand_relation
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="品牌分类关联",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryBrandRelation extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="",name="id")
    private Long id;

    @ApiModelProperty(value="品牌id",name="brandId")
    private Long brandId;

    @ApiModelProperty(value="分类id",name="catelogId")
    private Long catelogId;

    @ApiModelProperty(value="",name="brandName")
    private String brandName;

    @ApiModelProperty(value="",name="catelogName")
    private String catelogName;

}
