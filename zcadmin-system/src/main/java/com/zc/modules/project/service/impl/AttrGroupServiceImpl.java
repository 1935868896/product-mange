package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.AttrGroupMapper;
import com.zc.modules.project.entity.AttrGroup;
import com.zc.modules.project.service.AttrGroupService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 属性分组 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupMapper, AttrGroup> implements AttrGroupService {

    private final AttrGroupMapper attrGroupMapper;

    /**
     * 查询属性分组信息
     *
     * @param id 属性分组ID
     * @return 属性分组信息
     */
    @Override
    public AttrGroup selectByPrimaryKey(Long id) {
        return attrGroupMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询属性分组列表
     *
     * @param record 属性分组信息
     * @return 属性分组集合
     */
    @Override
    public List<AttrGroup> selectListBySelective(AttrGroup record) {
        return attrGroupMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询属性分组列表
     *
     * @param record 属性分组信息
     * @param page mybatis-plus 分页对象
     * @return 属性分组集合
     */
    @Override
    public IPage<AttrGroup> selectPageBySelective(AttrGroup record, Page page) {
        return attrGroupMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询属性分组列表
     *
     * @param ids 属性分组主键List集合
     * @return 属性分组集合
     */
    @Override
    public List<AttrGroup> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return attrGroupMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 属性分组 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(AttrGroup record) {
        return attrGroupMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 属性分组 信息
     * @return 插入数量
     */
    @Override
    public int insert(AttrGroup record) {
        return attrGroupMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 属性分组 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(AttrGroup record) {
        return attrGroupMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 属性分组集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<AttrGroup> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrGroup>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrGroup> records : list) {
            int count = attrGroupMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 属性分组 信息
     * @return 修改数量
     */
    @Override
    public int update(AttrGroup record) {
        return attrGroupMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 属性分组 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(AttrGroup record) {
        return attrGroupMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 属性分组 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<AttrGroup> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrGroup>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrGroup> records : list) {
            int count = attrGroupMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 属性分组 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<AttrGroup> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrGroup>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrGroup> records : listLists) {
            int count = attrGroupMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 属性分组 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return attrGroupMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 属性分组 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return attrGroupMapper.deleteByPrimaryKeys(ids);
    }

}
