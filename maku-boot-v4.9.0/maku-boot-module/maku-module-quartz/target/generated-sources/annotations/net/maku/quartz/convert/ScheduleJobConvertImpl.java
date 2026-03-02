package net.maku.quartz.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.quartz.entity.ScheduleJobEntity;
import net.maku.quartz.vo.ScheduleJobVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:43+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class ScheduleJobConvertImpl implements ScheduleJobConvert {

    @Override
    public ScheduleJobEntity convert(ScheduleJobVO vo) {
        if ( vo == null ) {
            return null;
        }

        ScheduleJobEntity scheduleJobEntity = new ScheduleJobEntity();

        scheduleJobEntity.setBeanName( vo.getBeanName() );
        scheduleJobEntity.setConcurrent( vo.getConcurrent() );
        scheduleJobEntity.setCreateTime( vo.getCreateTime() );
        scheduleJobEntity.setCronExpression( vo.getCronExpression() );
        scheduleJobEntity.setId( vo.getId() );
        scheduleJobEntity.setJobGroup( vo.getJobGroup() );
        scheduleJobEntity.setJobName( vo.getJobName() );
        scheduleJobEntity.setMethod( vo.getMethod() );
        scheduleJobEntity.setParams( vo.getParams() );
        scheduleJobEntity.setRemark( vo.getRemark() );
        scheduleJobEntity.setStatus( vo.getStatus() );

        return scheduleJobEntity;
    }

    @Override
    public ScheduleJobVO convert(ScheduleJobEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ScheduleJobVO scheduleJobVO = new ScheduleJobVO();

        scheduleJobVO.setBeanName( entity.getBeanName() );
        scheduleJobVO.setConcurrent( entity.getConcurrent() );
        scheduleJobVO.setCreateTime( entity.getCreateTime() );
        scheduleJobVO.setCronExpression( entity.getCronExpression() );
        scheduleJobVO.setId( entity.getId() );
        scheduleJobVO.setJobGroup( entity.getJobGroup() );
        scheduleJobVO.setJobName( entity.getJobName() );
        scheduleJobVO.setMethod( entity.getMethod() );
        scheduleJobVO.setParams( entity.getParams() );
        scheduleJobVO.setRemark( entity.getRemark() );
        scheduleJobVO.setStatus( entity.getStatus() );

        return scheduleJobVO;
    }

    @Override
    public List<ScheduleJobVO> convertList(List<ScheduleJobEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ScheduleJobVO> list1 = new ArrayList<ScheduleJobVO>( list.size() );
        for ( ScheduleJobEntity scheduleJobEntity : list ) {
            list1.add( convert( scheduleJobEntity ) );
        }

        return list1;
    }
}
