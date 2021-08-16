package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 属性分组表 pms_attr_group
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="属性分组",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttrGroup extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="分组id",name="attrGroupId")
    private Long attrGroupId;

    @ApiModelProperty(value="组名",name="attrGroupName")
    private String attrGroupName;

    @ApiModelProperty(value="排序",name="sort")
    private Integer sort;

    @ApiModelProperty(value="描述",name="descript")
    private String descript;

    @ApiModelProperty(value="组图标",name="icon")
    private String icon;

    @ApiModelProperty(value="所属分类id",name="catelogId")
    private Long catelogId;

}
