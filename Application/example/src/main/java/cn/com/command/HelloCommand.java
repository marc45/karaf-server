package cn.com.command;

import lombok.extern.log4j.Log4j;
import org.apache.felix.gogo.commands.Action;
import org.apache.felix.service.command.CommandSession;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;

/**
 * Created by xiaxuan on 16/4/20.
 */
@Service
@Log4j
@Command(scope = "test", name = "hello", description = "start for hello world")
public class HelloCommand implements Action{

    public Object execute(CommandSession session) throws Exception {
        log.info("Hello word");
        return null;
    }
}
