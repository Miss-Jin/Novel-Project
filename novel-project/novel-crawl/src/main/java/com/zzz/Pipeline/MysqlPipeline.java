package com.zzz.Pipeline;

import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

//把数据存入mysql
@Component
public class MysqlPipeline implements Pipeline {
    @Override
    public void process(ResultItems resultItems, Task task) {

    }
}
