/**
 * Copyright 2015 Ram Sriharsha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.magellan.execution

import org.apache.spark.annotation.Experimental
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.SparkPlan
import org.apache.spark.sql.{SQLContext, Strategy}

trait MagellanStrategies {

  self: SQLContext#SparkPlanner =>

  @Experimental
  object SpatialJoin extends Strategy {
    override def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
      case _ =>  Nil
    }
  }
}