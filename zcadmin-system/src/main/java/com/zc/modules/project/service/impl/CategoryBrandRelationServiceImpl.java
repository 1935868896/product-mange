package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.CategoryBrandRelationMapper;
import com.zc.modules.project.entity.CategoryBrandRelation;
import com.zc.modules.project.service.CategoryBrandRelationService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 品牌分类关联 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationMapper, CategoryBrandRelation> implements CategoryBrandRelationService {

    private final CategoryBrandRelationMapper categoryBrandRelationMapper;

    /**
     * 查询品牌分类关联信息
     *
     * @param id 品牌分类关联ID
     * @return 品牌分类关联信息
     */
    @Override
    public CategoryBrandRelation selectByPrimaryKey(Long id) {
        return categoryBrandRelationMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询品牌分类关联列表
     *
     * @param record 品牌分类关联信息
     * @return 品牌分类关联集合
     */
    @Override
    public List<CategoryBrandRelation> selectListBySelective(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询品牌分类关联列表
     *
     * @param record 品牌分类关联信息
     * @param page mybatis-plus 分页对象
     * @return 品牌分类关联集合
     */
    @Override
    public IPage<CategoryBrandRelation> selectPageBySelective(CategoryBrandRelation record, Page page) {
        return categoryBrandRelationMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询品牌分类关联列表
     *
     * @param ids 品牌分类关联主键List集合
     * @return 品牌分类关联集合
     */
    @Override
    public List<CategoryBrandRelation> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return categoryBrandRelationMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 品牌分类关联 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 品牌分类关联 信息
     * @return 插入数量
     */
    @Override
    public int insert(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 品牌分类关联 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 品牌分类关联集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<CategoryBrandRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<CategoryBrandRelation>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<CategoryBrandRelation> records : list) {
            int count = categoryBrandRelationMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 品牌分类关联 信息
     * @return 修改数量
     */
    @Override
    public int update(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 品牌分类关联 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(CategoryBrandRelation record) {
        return categoryBrandRelationMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 品牌分类关联 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<CategoryBrandRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<CategoryBrandRelation>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<CategoryBrandRelation> records : list) {
            int count = categoryBrandRelationMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 品牌分类关联 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<CategoryBrandRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<CategoryBrandRelation>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<CategoryBrandRelation> records : listLists) {
            int count = categoryBrandRelationMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 品牌分类关联 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return categoryBrandRelationMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 品牌分类关联 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return categoryBrandRelationMapper.deleteByPrimaryKeys(ids);
    }

}
