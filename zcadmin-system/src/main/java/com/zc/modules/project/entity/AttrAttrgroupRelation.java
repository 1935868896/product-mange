package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 属性&属性分组关联表 pms_attr_attrgroup_relation
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="属性&属性分组关联",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttrAttrgroupRelation extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="属性id",name="attrId")
    private Long attrId;

    @ApiModelProperty(value="属性分组id",name="attrGroupId")
    private Long attrGroupId;

    @ApiModelProperty(value="属性组内排序",name="attrSort")
    private Integer attrSort;

}
