package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.AttrMapper;
import com.zc.modules.project.entity.Attr;
import com.zc.modules.project.service.AttrService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品属性 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements AttrService {

    private final AttrMapper attrMapper;

    /**
     * 查询商品属性信息
     *
     * @param id 商品属性ID
     * @return 商品属性信息
     */
    @Override
    public Attr selectByPrimaryKey(Long id) {
        return attrMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询商品属性列表
     *
     * @param record 商品属性信息
     * @return 商品属性集合
     */
    @Override
    public List<Attr> selectListBySelective(Attr record) {
        return attrMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询商品属性列表
     *
     * @param record 商品属性信息
     * @param page mybatis-plus 分页对象
     * @return 商品属性集合
     */
    @Override
    public IPage<Attr> selectPageBySelective(Attr record, Page page) {
        return attrMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询商品属性列表
     *
     * @param ids 商品属性主键List集合
     * @return 商品属性集合
     */
    @Override
    public List<Attr> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return attrMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 商品属性 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(Attr record) {
        return attrMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 商品属性 信息
     * @return 插入数量
     */
    @Override
    public int insert(Attr record) {
        return attrMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 商品属性 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(Attr record) {
        return attrMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 商品属性集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<Attr> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Attr>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Attr> records : list) {
            int count = attrMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 商品属性 信息
     * @return 修改数量
     */
    @Override
    public int update(Attr record) {
        return attrMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 商品属性 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(Attr record) {
        return attrMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 商品属性 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<Attr> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Attr>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Attr> records : list) {
            int count = attrMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 商品属性 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<Attr> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<Attr>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<Attr> records : listLists) {
            int count = attrMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 商品属性 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return attrMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 商品属性 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return attrMapper.deleteByPrimaryKeys(ids);
    }

}
