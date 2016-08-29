package com.pentahohub.boot.snowflake;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by LUOXC on 2016/8/29.
 */
@RestController
@RequestMapping( "/ids" )
public class IdsRestController {

  private IdWorker idWorker = new IdWorker( 1, 1 );

  @RequestMapping( method = RequestMethod.POST )
  public List<String> create( @RequestParam( name = "num", required = false, defaultValue = "1" ) int num ) {
    if ( num <= 0 ) {
      return Collections.emptyList();
    }
    List<String> ids = new ArrayList<>( num );
    for ( int i = 0; i < num; i++ ) {
      ids.add( String.valueOf( idWorker.nextId() ) );
    }
    return ids;
  }


}
