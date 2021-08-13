package com.zc.modules.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.extra.spring.SpringUtil;
import com.zc.modules.project.vo.CategoryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.CategoryMapper;
import com.zc.modules.project.entity.Category;
import com.zc.modules.project.service.CategoryService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品三级分类 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-13
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    private final CategoryMapper categoryMapper;

    /**
     * 查询商品三级分类信息
     *
     * @param id 商品三级分类ID
     * @return 商品三级分类信息
     */
    @Override
    public Category selectByPrimaryKey(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询商品三级分类列表
     *
     * @param record 商品三级分类信息
     * @return 商品三级分类集合
     */
    @Override
    public List<Category> selectListBySelective(Category record) {
        return categoryMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询商品三级分类列表
     *
     * @param record 商品三级分类信息
     * @param page mybatis-plus 分页对象
     * @return 商品三级分类集合
     */
    @Override
    public IPage<Category> selectPageBySelective(Category record, Page page) {
        return categoryMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询商品三级分类列表
     *
     * @param ids 商品三级分类主键List集合
     * @return 商品三级分类集合
     */
    @Override
    public List<Category> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return categoryMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 商品三级分类 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(Category record) {
        return categoryMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 商品三级分类 信息
     * @return 插入数量
     */
    @Override
    public int insert(Category record) {
        return categoryMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 商品三级分类 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 商品三级分类集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<Category> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Category>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Category> records : list) {
            int count = categoryMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 商品三级分类 信息
     * @return 修改数量
     */
    @Override
    public int update(Category record) {
        return categoryMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 商品三级分类 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(Category record) {
        return categoryMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 商品三级分类 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<Category> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Category>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Category> records : list) {
            int count = categoryMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 商品三级分类 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<Category> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Category>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Category> records : listLists) {
            int count = categoryMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 商品三级分类 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 商品三级分类 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return categoryMapper.deleteByPrimaryKeys(ids);
    }

    @Override
    public CategoryVo getTrees() {

        List<Category> categories = categoryMapper.selectListBySelective(null);
        /**
         *  目标: 形成三层结构
         *  自己的想法: 三重循环
         *
         */
        CategoryVo categoryVo=new CategoryVo();
        categoryVo.setCatId(0l);
        getChild(categories,categoryVo);

        return categoryVo;
    }

    public void getChild(List<Category> categories,CategoryVo categoryVo){
        Long catId = categoryVo.getCatId();
        List<CategoryVo> categoryVos=new ArrayList<>();
        for (Category category : categories) {
            if (category.getParentCid()==catId){
                CategoryVo childCategoryVo=new CategoryVo();
                BeanUtils.copyProperties(category,childCategoryVo);
                getChild(categories,childCategoryVo);
                categoryVos.add(childCategoryVo);
            }
        }
        categoryVo.setChild(categoryVos);
    }

}
