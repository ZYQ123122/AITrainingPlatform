package net.maku.quartz.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.quartz.entity.ScheduleJobLogEntity;
import net.maku.quartz.vo.ScheduleJobLogVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:43+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class ScheduleJobLogConvertImpl implements ScheduleJobLogConvert {

    @Override
    public ScheduleJobLogEntity convert(ScheduleJobLogVO vo) {
        if ( vo == null ) {
            return null;
        }

        ScheduleJobLogEntity scheduleJobLogEntity = new ScheduleJobLogEntity();

        scheduleJobLogEntity.setBeanName( vo.getBeanName() );
        scheduleJobLogEntity.setCreateTime( vo.getCreateTime() );
        scheduleJobLogEntity.setError( vo.getError() );
        scheduleJobLogEntity.setId( vo.getId() );
        scheduleJobLogEntity.setJobGroup( vo.getJobGroup() );
        scheduleJobLogEntity.setJobId( vo.getJobId() );
        scheduleJobLogEntity.setJobName( vo.getJobName() );
        scheduleJobLogEntity.setMethod( vo.getMethod() );
        scheduleJobLogEntity.setParams( vo.getParams() );
        scheduleJobLogEntity.setStatus( vo.getStatus() );
        if ( vo.getTimes() != null ) {
            scheduleJobLogEntity.setTimes( vo.getTimes().longValue() );
        }

        return scheduleJobLogEntity;
    }

    @Override
    public ScheduleJobLogVO convert(ScheduleJobLogEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ScheduleJobLogVO scheduleJobLogVO = new ScheduleJobLogVO();

        scheduleJobLogVO.setBeanName( entity.getBeanName() );
        scheduleJobLogVO.setCreateTime( entity.getCreateTime() );
        scheduleJobLogVO.setError( entity.getError() );
        scheduleJobLogVO.setId( entity.getId() );
        scheduleJobLogVO.setJobGroup( entity.getJobGroup() );
        scheduleJobLogVO.setJobId( entity.getJobId() );
        scheduleJobLogVO.setJobName( entity.getJobName() );
        scheduleJobLogVO.setMethod( entity.getMethod() );
        scheduleJobLogVO.setParams( entity.getParams() );
        scheduleJobLogVO.setStatus( entity.getStatus() );
        if ( entity.getTimes() != null ) {
            scheduleJobLogVO.setTimes( entity.getTimes().intValue() );
        }

        return scheduleJobLogVO;
    }

    @Override
    public List<ScheduleJobLogVO> convertList(List<ScheduleJobLogEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ScheduleJobLogVO> list1 = new ArrayList<ScheduleJobLogVO>( list.size() );
        for ( ScheduleJobLogEntity scheduleJobLogEntity : list ) {
            list1.add( convert( scheduleJobLogEntity ) );
        }

        return list1;
    }
}
