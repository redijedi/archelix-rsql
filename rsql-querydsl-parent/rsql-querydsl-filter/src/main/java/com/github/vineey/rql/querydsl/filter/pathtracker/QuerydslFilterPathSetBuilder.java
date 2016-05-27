/*
* MIT License
* 
* Copyright (c) 2016 John Michael Vincent S. Rustia
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
* 
*/
package com.github.vineey.rql.querydsl.filter.pathtracker;

import com.github.vineey.rql.filter.FilterBuilder;
import com.github.vineey.rql.querydsl.core.PathSet;
import com.github.vineey.rql.querydsl.filter.QuerydslFilterParam;
import cz.jirutka.rsql.parser.ast.Node;

/**
 * @author vrustia - 5/27/16.
 */
public class QuerydslFilterPathSetBuilder implements FilterBuilder<PathSet, QuerydslFilterParam> {
    @Override
    public PathSet visit(Node node, QuerydslFilterParam querydslFilterParam) {
        return node.accept(QuerydslPathSetRsqlVisitor.getInstance(), querydslFilterParam);
    }
}
