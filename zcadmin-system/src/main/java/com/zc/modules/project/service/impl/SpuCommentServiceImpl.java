package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SpuCommentMapper;
import com.zc.modules.project.entity.SpuComment;
import com.zc.modules.project.service.SpuCommentService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品评价 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentMapper, SpuComment> implements SpuCommentService {

    private final SpuCommentMapper spuCommentMapper;

    /**
     * 查询商品评价信息
     *
     * @param id 商品评价ID
     * @return 商品评价信息
     */
    @Override
    public SpuComment selectByPrimaryKey(Long id) {
        return spuCommentMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询商品评价列表
     *
     * @param record 商品评价信息
     * @return 商品评价集合
     */
    @Override
    public List<SpuComment> selectListBySelective(SpuComment record) {
        return spuCommentMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询商品评价列表
     *
     * @param record 商品评价信息
     * @param page mybatis-plus 分页对象
     * @return 商品评价集合
     */
    @Override
    public IPage<SpuComment> selectPageBySelective(SpuComment record, Page page) {
        return spuCommentMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询商品评价列表
     *
     * @param ids 商品评价主键List集合
     * @return 商品评价集合
     */
    @Override
    public List<SpuComment> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return spuCommentMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 商品评价 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SpuComment record) {
        return spuCommentMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 商品评价 信息
     * @return 插入数量
     */
    @Override
    public int insert(SpuComment record) {
        return spuCommentMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 商品评价 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SpuComment record) {
        return spuCommentMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 商品评价集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SpuComment> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuComment>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuComment> records : list) {
            int count = spuCommentMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 商品评价 信息
     * @return 修改数量
     */
    @Override
    public int update(SpuComment record) {
        return spuCommentMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 商品评价 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SpuComment record) {
        return spuCommentMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 商品评价 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SpuComment> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuComment>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuComment> records : list) {
            int count = spuCommentMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 商品评价 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SpuComment> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuComment>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuComment> records : listLists) {
            int count = spuCommentMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 商品评价 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return spuCommentMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 商品评价 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return spuCommentMapper.deleteByPrimaryKeys(ids);
    }

}
