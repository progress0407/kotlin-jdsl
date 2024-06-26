package com.linecorp.kotlinjdsl.support.hibernate.reactive.extension

import com.linecorp.kotlinjdsl.SinceJdsl
import com.linecorp.kotlinjdsl.querymodel.jpql.delete.DeleteQuery
import com.linecorp.kotlinjdsl.querymodel.jpql.select.SelectQuery
import com.linecorp.kotlinjdsl.querymodel.jpql.update.UpdateQuery
import com.linecorp.kotlinjdsl.render.RenderContext
import com.linecorp.kotlinjdsl.support.hibernate.reactive.JpqlStageStatelessSessionUtils
import org.hibernate.reactive.stage.Stage

/**
 * Creates a [Stage.Query] from the [SelectQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: SelectQuery<T>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, query.returnType, context)

/**
 * Creates a [Stage.Query] from the [SelectQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: SelectQuery<T>,
    queryParams: Map<String, Any?>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, queryParams, query.returnType, context)

/**
 * Creates a [Stage.Query] from the [UpdateQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: UpdateQuery<T>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, context)

/**
 * Creates a [Stage.Query] from the [UpdateQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: UpdateQuery<T>,
    queryParams: Map<String, Any?>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, queryParams, context)

/**
 * Creates a [Stage.Query] from the [DeleteQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: DeleteQuery<T>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, context)

/**
 * Creates a [Stage.Query] from the [DeleteQuery] and [RenderContext].
 */
@SinceJdsl("3.0.0")
fun <T : Any> Stage.StatelessSession.createQuery(
    query: DeleteQuery<T>,
    queryParams: Map<String, Any?>,
    context: RenderContext,
): Stage.Query<T> = JpqlStageStatelessSessionUtils.createQuery(this, query, queryParams, context)
